package tests;

import amino.Client;
import amino.models.response.account.AccountData;
import amino.models.response.sub_clients.CommunitiesData;
import amino.models.response.sub_clients.CommunityListItem;
import amino.models.response.thread_list.ThreadList;
import amino.models.response.thread_list.ThreadListItem;

import java.util.Scanner;

public class Test {
    static Scanner input = new Scanner(System.in);
    static Client client = new Client();

    public static void main(String[] args) {
//        System.out.print("Логин: ");
//        String email = input.nextLine();
//        System.out.print("Пароль: ");
//        String password = input.nextLine();
//        System.out.println("Авторизация " + email + "...");
//        AccountData account = client.tryLogin(email, password);
//        if (account == null) {
//            System.out.println("Ошибка авторизации");
//            return;
//        }
//        System.out.println("Авторизация прошла успешно!");
//        CommunitiesData sub_clients = client.getSubClients(0, 100);
//        if (sub_clients != null) {
//            int x = 0;
//            System.out.println("Сообщества:");
//            for (CommunityListItem i : sub_clients.getCommunityList()) {
//                x += 1;
//                System.out.println(x + ". " + i.getName());
//            }
//        } else {
//            System.out.println("Сообществ не найдено.");
//            return;
//        }
//        System.out.print("Введите номер сообщества: ");
//
//        int ndcIndex = Integer.parseInt(input.nextLine());
//        Client.SubClient subClient = new Client.SubClient(String.valueOf(sub_clients.getCommunityList().get(ndcIndex - 1).getNdcId()));
//
//        ThreadList threads = subClient.getChatThreads("joined-me", 0, 100);
//        System.out.println("Мои чаты:");
//        int z = 0;
//        for (ThreadListItem i : threads.getThreadList()) {
//            z += 1;
//            System.out.println(z + ". " + i.getTitle());
//        }
//        System.out.print("Введите номер чата или \"+\" для выбора чата по ссылке: ");
//        String choice = input.nextLine();
//        String chatId;
//        if (choice.equals("+")) {
//            System.out.print("Вставьте ссылку на чат: ");
//            String[] words = input.nextLine().split("/");
//            chatId = client.getFromCode(words[words.length-1]).getObjectId();
//        } else {
//            int chatIndex = Integer.parseInt(choice);
//            chatId = threads.getThreadList().get(chatIndex - 1).getThreadId();
//        }
//        System.out.print("Текст сообщения: ");
//        String message = input.nextLine();
//        subClient.sendMessage(message, chatId);
//        System.out.println("Сообщение отправлено");
    }
}
