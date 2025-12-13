public class LibraryMember {
        public String name;
        private int memberId;

        public LibraryMember(String name, int memberId){
            this.name=name;
            this.memberId=memberId;

        }

        public String getName() {
            return name;
        }

        public int getMemberId() {
            return memberId;
        }

        public void setName(String name) {
            this.name = name;
        }

        public void setMemberId(int memberId) {
            this.memberId = memberId;
        }
        public void displayInfo(){
            System.out.println("Member: " + name + ", ID: " + memberId);
        }
    }

