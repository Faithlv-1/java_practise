package 自定义异常;

import java.security.UnresolvedPermission;

public class exced extends Exception{
    public exced(){}

    public exced(String message){
        super(message);
    }
}
