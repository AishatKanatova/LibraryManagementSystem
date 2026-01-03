public class LibraryMember extends Person {

    private int memberId;

    public LibraryMember(String name, int memberId) {
        super(name);
        this.memberId = memberId;
    }

    public int getMemberId() {
        return memberId;
    }

    public void setMemberId(int memberId) {
        this.memberId = memberId;
    }

    @Override
    public String getRole() {
        return "Library Member";
    }

    @Override
    public String toString() {
        return "Member{name='" + name + "', id=" + memberId + "}";
    }
}
