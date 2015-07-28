/**
 * 
 */

/**
 * @author PT28001
 *
 */
import com.opensymphony.xwork2.ActionSupport;
public class LoginAction extends ActionSupport{
 
 private String userName;
 private String password; 
 
 public String getUserName() {
  return userName;
 }
 public void setUserName(String userName) {
  this.userName = userName;
 }
 public String getPassword() {
  return password;
 }

 public void setPassword(String password) {
  this.password = password;
 }

 public String execute() throws Exception {
 
  boolean result = UserModel.isUserNameAndPasswordExist(userName, password);
  if(result){
   return "success";
  }else{
   return "failure";
  }
  
 }
}

