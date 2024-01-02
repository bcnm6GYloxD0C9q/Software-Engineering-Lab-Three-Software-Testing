public class UserManager {
    public boolean login(String username, String password) {
        // 这里应该有代码来验证用户名和密码
        // 简化示例中，我们假设任何用户名和密码组合都有效
        return username != null && password != null && !username.isEmpty() && !password.isEmpty();
    }

    public boolean register(String username, String password) {
        // 这里应该有代码来注册新用户
        // 简化示例中，我们假设注册总是成功
        return true;
    }
}
