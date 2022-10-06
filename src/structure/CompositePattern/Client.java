package structure.CompositePattern;

/**
 * 客户端构造菜单
 *                            系统管理
 *              用户            角色            菜单
 *           增  删 改 查    增  删  改  查      增  删  改  查
 */
public class Client {

    public static void main(String[] args) {
        //构造树形菜单
        //系统管理
        TreeMenu treeMenu =  new TreeMenu(1L,"系统管理","/system");
        //用户管理
        TreeMenu userMenu =  new TreeMenu(2L,"用户管理","/system/user");
        treeMenu.addSysMenu(userMenu);
        userMenu.setParentId(1L);
        //角色管理
        TreeMenu roleMenu =  new TreeMenu(3L,"角色管理","/system/role");
        treeMenu.addSysMenu(roleMenu);
        roleMenu.setParentId(1L);
        //权限管理
        TreeMenu permisMenu =  new TreeMenu(4L,"权限管理","/system/permis");
        treeMenu.addSysMenu(permisMenu);
        permisMenu.setParentId(1L);

        //用户管理增
        TreeMenu userMenuAdd =  new TreeMenu(5L,"用户管理","/system/user/add");
        //用户管理删
        TreeMenu userMenuDel =  new TreeMenu(6L,"用户管理","/system/user/del");
        //用户管理改
        TreeMenu userMenuUpdate =  new TreeMenu(7L,"用户管理","/system/user/update");
        //用户管理查
        TreeMenu userMenuRead =  new TreeMenu(8L,"用户管理","/system/user/read");
        userMenu.addSysMenu(userMenuAdd);
        userMenuAdd.setParentId(2L);
        userMenu.addSysMenu(userMenuDel);
        userMenuDel.setParentId(2L);
        userMenu.addSysMenu(userMenuUpdate);
        userMenuUpdate.setParentId(2L);
        userMenu.addSysMenu(userMenuRead);
        userMenuRead.setParentId(2L);
        //权限管理增
        TreeMenu permisMenuAdd =  new TreeMenu(9L,"权限管理","/system/permis/add");
        //权限管理改
        TreeMenu permisMenuUpdate =  new TreeMenu(10L,"权限管理","/system/permis/update");
        //权限管理查
        TreeMenu permisMenuRead =  new TreeMenu(11L,"权限管理","/system/permis/read");
        //权限管理删
        TreeMenu permisMenuDelete =  new TreeMenu(12L,"权限管理","/system/permis/delete");

        permisMenu.addSysMenu(permisMenuAdd);
        permisMenuAdd.setParentId(4L);
        permisMenu.addSysMenu(permisMenuUpdate);
        permisMenuUpdate.setParentId(4L);
        permisMenu.addSysMenu(permisMenuRead);
        permisMenuRead.setParentId(4L);
        permisMenu.addSysMenu(permisMenuDelete);
        permisMenuDelete.setParentId(4L);
        System.out.println(treeMenu);



    }
}
