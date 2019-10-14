package example.assignment.cusEnum;

public enum Role {
    TRAVELER(1), GUIDE(2);
    int value;

    Role(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public Role findByValue(int value){
        for (Role role: Role.values()) {
            if (role.getValue() == value){
                return role;
            }
        }
        return null;
    }
}
