public class Library {
        public String libraryName;
        public String address;
        public Library(String libraryName, String address){
            this.libraryName=libraryName;
            this.address=address;
        }

        public String getLibraryName() {
            return libraryName;
        }

        public String getAddress() {
            return address;
        }

        public void setLibraryName(String libraryName) {
            this.libraryName = libraryName;
        }

        public void setAddress(String address) {
            this.address = address;
        }
        public void displayInfo(){
            System.out.println("Library: " + libraryName + ", Address: " + address);

        }

    }

