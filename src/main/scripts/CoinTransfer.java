import amino.Client;
import amino.SubClient;

import java.util.List;

public class CoinTransfer {
    public static void main(String[] args) throws Exception {
        var client = new Client();
        client.login("shadowtruddy@gmail.com", "b66ixib0tez");
        var subClient = new SubClient("206503597", client);
        List<String> uids = List.of("0f0e3d2b-ed1c-4ec6-a878-7bec36859a1f");
        subClient.startChat(uids, "Hello, World", "Hello", "World");
        System.out.println("Завершено");
    }
}
