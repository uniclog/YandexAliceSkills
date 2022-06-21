package local.uniclog.pw;

import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.function.Function;

public class Handler implements Function<Request, Response> {

    @Override
    public Response apply(Request request) {
        var command = request.request.get("command");
        String answer = prepareAnswer(command);

        return new Response(answer);
    }

    private static String prepareAnswer(Object command) {
        ZonedDateTime now = ZonedDateTime.now();
        ZonedDateTime moscow = now.withZoneSameInstant(ZoneId.of("Europe/Moscow"));

        String cmd = String.format("%s", command);
        return getAnswer(EventMap.parseDay(cmd, moscow.getDayOfMonth()), cmd);
    }

    private static String getAnswer(int dayOfMonth, String command) {
        var events = EventMap.eventMap();
        DataPair event = events.getOrDefault(dayOfMonth, new DataPair("", ""));
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
        return getStartWith(command, event.getText()) + " +ежа в " + answer;
    }
    private static String getStartWith(String command, String answer) {
         // if (command.equals("завтра")) return "завтра"
         // if (command.equals("сегодня")) return  "сегодня"
         return command.replaceAll("[1-9]+", answer);
    }
}
