package structure.CompositePattern;

/**
 * 菜单类
 */
public class SysMenu {
    /**
     * 菜单ID
      */
    private Long menuId;

    /**
     *  菜单名称
     */
    private String menuName;
    /**
     * 菜单路径
     */
    private String path;

    private Long parent;

    public SysMenu(Long menuId, String menuName, String path) {
        this.menuId = menuId;
        this.menuName = menuName;
        this.path = path;
    }

    public String getSysMenInfo() {
        return "SysMenu{" +
                "menuId=" + menuId +
                ", menuName='" + menuName + '\'' +
                ", path='" + path + '\'' +
                '}';
    }

    /**
     * 设置父节点
     * @return
     */
    public Long getParent() {
        return parent;
    }

    public void setParent(Long parent) {
        this.parent = parent;
    }
}
