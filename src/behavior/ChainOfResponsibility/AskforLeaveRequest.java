package behavior.ChainOfResponsibility;

    /**
     * 请假 需要三级审批
     * level1 班主任
     * level2 副校长
     * level3 正校长
     */
    public class AskforLeaveRequest {
        //请假的姓名
        private String stuName;
        //请假原因
        private String reason;
        //审批级别到
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
