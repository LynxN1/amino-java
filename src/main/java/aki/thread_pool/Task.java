package aki.thread_pool;

import aki.client.Client;

public class Task implements Runnable {

    private final Client.SubClient subClient;
    private final int num;
    private final String message;
    private final String chatId;

    public Task(int num, Client.SubClient subClient, String message, String chatId) {
        this.num = num;
        this.subClient = subClient;
        this.message = message;
        this.chatId = chatId;
    }

    public void run() {
        subClient.sendMessage(message, chatId);
        System.out.println(num + " сообщений отправлено");
    }
}
