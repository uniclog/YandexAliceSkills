package local.uniclog.pw;

import java.time.DayOfWeek;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.temporal.TemporalAdjusters;
import java.util.function.Function;

public class Handler implements Function<Request, Response> {

    private static String prepareAnswer(Object command) {
        String cmd = String.format("%s", command);
        return getAnswer(cmd);
    }

    private static String getAnswer(String command) {
        var events = EventMap.eventMap();
        var commandBuilder = new StringBuilder(command);
        getDayByStartCommand(commandBuilder);
        DataPair event = events.getOrDefault(EventMap.parseDay(commandBuilder.toString()), new DataPair("", ""));
        String answer;
        switch (event.getEvent()) {
            case "Д": {
                answer = "доспех";
                break;
            }
            case "О": {
                answer = "ор+ужие";
                break;
            }
            case "Р": {
                answer = "рел+иквии";
                break;
            }
            default:
                return "У меня таакой информации нет";
        }
        return String.join(" ", answerCorrect(command, event.getText()), event.getText(), "+ежа в", answer);
    }

    private static void getDayByStartCommand(StringBuilder commandBuilder) {
        var now = ZonedDateTime.now();
        var moscow = now.withZoneSameInstant(ZoneId.of("Europe/Moscow"));

        var dayOfWeek = moscow.getDayOfMonth();
        var command = commandBuilder.toString();

        if (command.contains("завтра")) dayOfWeek = moscow.getDayOfMonth() + 1;
        else if (command.contains("понед")) dayOfWeek = getDayOfWeek(moscow, DayOfWeek.MONDAY);
        else if (command.contains("вторник")) dayOfWeek = getDayOfWeek(moscow, DayOfWeek.TUESDAY);
        else if (command.contains("сред")) dayOfWeek = getDayOfWeek(moscow, DayOfWeek.WEDNESDAY);
        else if (command.contains("четверг")) dayOfWeek = getDayOfWeek(moscow, DayOfWeek.THURSDAY);
        else if (command.contains("пятниц")) dayOfWeek = getDayOfWeek(moscow, DayOfWeek.FRIDAY);
        else if (command.contains("суббот")) dayOfWeek = getDayOfWeek(moscow, DayOfWeek.SATURDAY);
        else if (command.contains("воскр")) dayOfWeek = getDayOfWeek(moscow, DayOfWeek.SUNDAY);

        commandBuilder.append(" ").append(dayOfWeek);
    }

    private static int getDayOfWeek(ZonedDateTime moscow, DayOfWeek dayOfWeek) {
        return moscow.with(TemporalAdjusters.next(dayOfWeek)).getDayOfMonth();
    }

    private static String answerCorrect(String command, String answer) {
        return command.replaceAll("[1-9]+", answer);
    }

    @Override
    public Response apply(Request request) {
        var command = request.request.get("command");
        String answer = prepareAnswer(command);

        return new Response(answer);
    }
}
