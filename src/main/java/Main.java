import client.Client;
import pojo.response.account.AccountData;
import pojo.response.sub_clients.CommunitiesData;
import pojo.response.sub_clients.CommunityListItem;

public class Main {

    public static void main(String[] args) {
        long m = System.currentTimeMillis() / 1000;
        Client client = new Client();
        AccountData account;
        account = client.login("akinatamain@inpwa.com", "b66ixib0tez");
        client.SID = account.getSid();
        System.out.println("My UserID: " + account.getAccount().getUid());
        CommunitiesData sub_clients;
        sub_clients = client.getSubClients(0, 100);
        if (sub_clients != null) {
            int x = 0;
            System.out.println("My communities:");
            for (CommunityListItem i:sub_clients.getCommunityList()) {
                x += 1;
                System.out.println(x + ". " + i.getName());
            }
        }
        System.out.println("Время выполнения программы: " + (double) (System.currentTimeMillis() / 1000 - m));
    }
}