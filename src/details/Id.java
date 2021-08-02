package details;

import java.util.Random;

public class Id {
    public Long getId() {
        Random random = new Random();
        return Long.parseLong(String.valueOf(random.nextLong()).substring(1,7));
    }
    public static void main(String[] args) {
        Id id = new Id();
        System.out.println(id.getId());
    }
}
