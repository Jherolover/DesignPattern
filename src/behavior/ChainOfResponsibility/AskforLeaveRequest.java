package behavior.ChainOfResponsibility;

    /**
     * ��� ��Ҫ��������
     * level1 ������
     * level2 ��У��
     * level3 ��У��
     */
    public class AskforLeaveRequest {
        //��ٵ�����
        private String stuName;
        //���ԭ��
        private String reason;
        //��������
        private int level = 1;

        public AskforLeaveRequest(String stuName, String reason) {
            this.stuName = stuName;
            this.reason = reason;
        }

        public String getStuName() {
            return stuName;
        }

        public void setStuName(String stuName) {
            this.stuName = stuName;
        }

        public String getReason() {
            return reason;
        }

        public void setReason(String reason) {
            this.reason = reason;
        }

        public int getLevel() {
            return level;
        }

        public void setLevel(int level) {
            this.level = level;
        }
    }
