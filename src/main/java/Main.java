import client.Client;
import java.util.Scanner;
import pojo.response.account.AccountData;
import pojo.response.sub_clients.CommunitiesData;
import pojo.response.sub_clients.CommunityListItem;
import pojo.response.thread_list.ThreadList;
import pojo.response.thread_list.ThreadListItem;
import utils.TimeUtils;

public class Main {

  public static void main(String[] args) {
    System.out.println("START");
    int startUnixInstant = TimeUtils.unixInstant();
    Client client = new Client();
    AccountData account;

    String email = "";
    String password = "";
    System.out.println("Login " + email + "...");
    account = client.tryLogin(email, password);
    if (account == null) {
      System.out.println("Login failed");
      return;
    }
    System.out.println("Successful!");
    System.out.println("My UserID: " + account.getAccount().getUid());

    CommunitiesData sub_clients;
    sub_clients = client.getSubClients(0, 100);
    if (sub_clients != null) {
      int x = 0;
      System.out.println("My communities:");
      for (CommunityListItem i : sub_clients.getCommunityList()) {
        x += 1;
        System.out.println(x + ". " + i.getName());
      }
    }

    Scanner input = new Scanner(System.in);
    System.out.print("Select community: ");
    int ndcIndex = Integer.parseInt(input.nextLine());
    client.comId = String.valueOf(sub_clients.getCommunityList().get(ndcIndex - 1).getNdcId());

    ThreadList threads = client.getChatThreads("joined-me", 0, 100);
    System.out.println("\nMy chats " + client.comId + ":");
    int z = 0;
    for (ThreadListItem i : threads.getThreadList()) {
      z += 1;
      System.out.println(z + ". " + i.getTitle() + " " + i.getThreadId());
    }
    System.out.print("Enter chat number: ");
    int chatIndex = Integer.parseInt(input.nextLine());
    String chatId = threads.getThreadList().get(chatIndex - 1).getThreadId();
    client.sendMessage("Test", chatId);
    System.out.println(
        "Время выполнения программы: " + (TimeUtils.unixInstant() - startUnixInstant) + " сек.");
  }
}