public class Result {

    static class UserTx implements Comparable<UserTx>{
        public int userId;
        public int transCount;
        public UserTx(int id, int count){
            this.userId = id;
            this.transCount = count;
        }

        @Override
        public int compareTo(UserTx a){
            if(this.transCount > a.transCount)
                return 1;
            if(this.transCount < a.transCount)
                return -1;
            return 0;
        }
    }
}
