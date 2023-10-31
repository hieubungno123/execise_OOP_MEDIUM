package statics;

public enum ReaderType {
    TEACHER ("Teacher"),
    STUDENT ("Student"),
    UNGRADUATE_STUDENT("Ungraduate Student");

    public String value;

    ReaderType(String value){
        this.value=value;
    }


}
