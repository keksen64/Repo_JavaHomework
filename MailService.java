package java_homework;

import java.util.*;
import java.util.function.Consumer;

public class MailService<T> implements Consumer<MailInterface<T>> {
    private final Map<String, List<T>> sort = new HashMap<>();
    public void accept(MailInterface<T> mailInt) {
        if (sort.containsKey(mailInt.getTo())) {
            List<T> list = sort.get(mailInt.getTo());
            list.add(mailInt.getContent());
        } else {
            sort.put(mailInt.getTo(), new ArrayList<>(Collections.singletonList(mailInt.getContent())));
        }
    }

    public Map<String, List<T>> getMailBox() {
        return sort;
    }

    public Consumer andThen(Consumer k) {
        return null;
    }
}
