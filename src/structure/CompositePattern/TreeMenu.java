package structure.CompositePattern;

import java.util.ArrayList;
import java.util.List;

/**
 * 属性菜单
 */
public class TreeMenu {
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

    private Long parentId;
    /**
     * 子菜单
     */
    private ArrayList<TreeMenu> childMenuList = new ArrayList<>();

    /**
     * 构造器
     * @param menuId
     * @param menuName
     * @param path
     */
    public TreeMenu(Long menuId, String menuName, String path) {
        this.menuId = menuId;
        this.menuName = menuName;
        this.path = path;
    }
    /**
     * 添加子节点菜单
     */
    public void addSysMenu(TreeMenu sysMenu) {
        this.childMenuList.add(sysMenu);
    }
    /**
     * 删除子节点菜单
     */
    public void removeSysMenu(TreeMenu sysMenu) {
        this.childMenuList.remove(sysMenu);
    }
    /**
     * 获取字节点菜单
     * @return
     */
    public ArrayList<TreeMenu> getChildSysMenu() {
        return this.childMenuList;
    }

    @Override
    public String toString() {
        return "TreeMenu{" +
                "menuId=" + menuId +
                ", menuName='" + menuName + '\'' +
                ", path='" + path + '\'' +
                ", parentId=" + parentId +
                ", childMenuList=" + childMenuList +
                '}';
    }

    public Long getParentId() {
        return parentId;
    }

    public void setParentId(Long parentId) {
        this.parentId = parentId;
    }
}
