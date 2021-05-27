package aki;

import aki.client.Client;
import aki.pojo.response.account.AccountData;
import aki.pojo.response.sub_clients.CommunitiesData;
import aki.pojo.response.sub_clients.CommunityListItem;
import aki.pojo.response.thread_list.ThreadList;
import aki.pojo.response.thread_list.ThreadListItem;
import aki.thread_pool.Task;
import aki.thread_pool.ThreadPool;

import java.util.Scanner;

public class Main {
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        Client client = new Client();
        AccountData account;
        System.out.print("Логин: ");
        String email = input.nextLine();
        System.out.print("Пароль: ");
        String password = input.nextLine();
        System.out.println("Авторизация " + email + "...");
        account = client.tryLogin(email, password);
        if (account == null) {
            System.out.println("Ошибка авторизации");
            return;
        }
        System.out.println("Авторизация прошла успешно!");
        CommunitiesData sub_clients;
        sub_clients = client.getSubClients(0, 100);
        if (sub_clients != null) {
            int x = 0;
            System.out.println("Сообщества:");
            for (CommunityListItem i : sub_clients.getCommunityList()) {
                x += 1;
                System.out.println(x + ". " + i.getName());
            }
        } else {
            System.out.println("Сообществ не найдено.");
            return;
        }
        System.out.print("Введите номер сообщества: ");

        int ndcIndex = Integer.parseInt(input.nextLine());
        Client.SubClient subClient;
        subClient = new Client.SubClient(String.valueOf(sub_clients.getCommunityList().get(ndcIndex - 1).getNdcId()));

        ThreadList threads = subClient.getChatThreads("joined-me", 0, 100);
        System.out.println("Мои чаты:");
        int z = 0;
        for (ThreadListItem i : threads.getThreadList()) {
            z += 1;
            System.out.println(z + ". " + i.getTitle());
        }
        System.out.print("Введите номер чата или \"+\" для выбора чата по ссылке: ");
        String choice = input.nextLine();
        String chatId;
        if (choice.equals("+")) {
            System.out.print("Вставьте ссылку на чат: ");
            String[] words = input.nextLine().split("/");
            chatId = client.getFromCode(words[words.length-1]).getObjectId();
        } else {
            int chatIndex = Integer.parseInt(choice);
            chatId = threads.getThreadList().get(chatIndex - 1).getThreadId();
        }
        System.out.print("Текст сообщения: ");
        String message = input.nextLine();
        System.out.print("Количество потоков: ");
        int nThreads = Integer.parseInt(input.nextLine());
        ThreadPool pool = new ThreadPool(nThreads);
        int c = 0;
        while (true) {
            c += 1;
            Task task = new Task(c, subClient, message, chatId);
            pool.execute(task);
        }
    }
}