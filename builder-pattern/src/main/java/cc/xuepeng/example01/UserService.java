package cc.xuepeng.example01;

public class UserService {

    public HttpResultEntity addUser() {
        return new HttpResultEntity.Builder(HttpResultStatus.OK).msg("Success").build();
    }

    public HttpResultEntity getUser() {
        User user = User.createInstance("US0001", "Jack");
        return new HttpResultEntity.Builder(HttpResultStatus.OK).data(user).build();
    }

}
