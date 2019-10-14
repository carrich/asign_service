package example.assignment.cusEnum;

public enum Status {
    DEACTIVE(0), ACTIVE(1), DELETED(-1);
    int value;

    Status(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public Status findByValue(int value){
        for (Status status: Status.values()) {
            if (status.getValue() == value){
                return status;
            }
        }
        return null;
    }
}
