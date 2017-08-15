package hyj.weixin_008.model;

/**
 * Created by Administrator on 2017/8/15.
 */

public class PhoneApi {
    private String apiId;
    private String pwd;
    private String pjId;
    private String token;
    private String phone;
    private String validCode;

    private String zcPwd;
    private boolean phoneIsAvailavle=false;
    private boolean validCodeIsAvailavle=false;

    public PhoneApi(String apiId, String pwd, String pjId,String zcPwd) {
        this.apiId = apiId;
        this.pwd = pwd;
        this.zcPwd = zcPwd;
        this.pjId = pjId;

    }

    public String getZcPwd() {
        return zcPwd;
    }

    public void setZcPwd(String zcPwd) {
        this.zcPwd = zcPwd;
    }

    public String getApiId() {
        return apiId;
    }

    public void setApiId(String apiId) {
        this.apiId = apiId;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public String getPjId() {
        return pjId;
    }

    public void setPjId(String pjId) {
        this.pjId = pjId;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getValidCode() {
        return validCode;
    }

    public void setValidCode(String validCode) {
        this.validCode = validCode;
    }

    public boolean isPhoneIsAvailavle() {
        return phoneIsAvailavle;
    }

    public void setPhoneIsAvailavle(boolean phoneIsAvailavle) {
        this.phoneIsAvailavle = phoneIsAvailavle;
    }

    public boolean isValidCodeIsAvailavle() {
        return validCodeIsAvailavle;
    }

    public void setValidCodeIsAvailavle(boolean validCodeIsAvailavle) {
        this.validCodeIsAvailavle = validCodeIsAvailavle;
    }
}
