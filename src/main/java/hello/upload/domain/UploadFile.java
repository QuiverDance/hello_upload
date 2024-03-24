package hello.upload.domain;

import lombok.Getter;

@Getter
public class UploadFile {

    private String uploadFileName;
    private String storeFileName; //중복 이름 방지

    public UploadFile(String uploadFileName, String storeFileName) {
        this.uploadFileName = uploadFileName;
        this.storeFileName = storeFileName;
    }
}
