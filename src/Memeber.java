public class Memeber {
    private int memberId;
    private String name;


    public  Memeber(int memberId, String name) {
        this.memberId = memberId;
        this.name = name;
    }

    public int getMemberId() {
        return memberId;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Memeber{" + "memberId=" + memberId + ", name=" + name + '}';
    }
}
