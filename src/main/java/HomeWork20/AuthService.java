package HomeWork20;

public interface AuthService {
    void start();
    String getNickByLoginPass(String login, String pass);
    void stop();
}
