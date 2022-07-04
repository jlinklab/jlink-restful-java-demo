package jlink.restful.java.sdk.exception;


/**
 * jlink CloudStorage
 *
 * @author hjm
 * @date 2022/07/01
 */
public class JLinkCloudStorageException extends JLinkException {
    public JLinkCloudStorageException(Integer code, String msg) {
        super(code, msg);
    }
}
