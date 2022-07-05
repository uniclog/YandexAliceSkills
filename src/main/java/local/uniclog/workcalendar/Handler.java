package local.uniclog.workcalendar;

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
        if (cmd.toLowerCase().contains("завтра")) {
            return getAnswer(moscow.getDayOfMonth() + 1, "Завтра");
        }
        return getAnswer(moscow.getDayOfMonth(), "Сегодня");
    }

    private static String getAnswer(int dayOfMonth, String startWith) {
        var events = EventMap.getEventMap();
        String event = events.getOrDefault(dayOfMonth, "");
        if (event.equals("")) {
            return startWith +  " вы не работаете ";
        }
        if (event.contains("отпуск")) {
            return startWith + " вы в отпуске";
        }
        return startWith + " вы работаете с " + event;
    }
}
