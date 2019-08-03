package entity;


public class RoleMenu {

  private long roleMenuId;
  private long roleId;
  private long menuId;
  private String createBy;
  private java.sql.Timestamp createTime;
  private java.sql.Timestamp lastUpdateBy;
  private java.sql.Timestamp lastUpdateTime;


  public long getRoleMenuId() {
    return roleMenuId;
  }

  public void setRoleMenuId(long roleMenuId) {
    this.roleMenuId = roleMenuId;
  }


  public long getRoleId() {
    return roleId;
  }

  public void setRoleId(long roleId) {
    this.roleId = roleId;
  }


  public long getMenuId() {
    return menuId;
  }

  public void setMenuId(long menuId) {
    this.menuId = menuId;
  }


  public String getCreateBy() {
    return createBy;
  }

  public void setCreateBy(String createBy) {
    this.createBy = createBy;
  }


  public java.sql.Timestamp getCreateTime() {
    return createTime;
  }

  public void setCreateTime(java.sql.Timestamp createTime) {
    this.createTime = createTime;
  }


  public java.sql.Timestamp getLastUpdateBy() {
    return lastUpdateBy;
  }

  public void setLastUpdateBy(java.sql.Timestamp lastUpdateBy) {
    this.lastUpdateBy = lastUpdateBy;
  }


  public java.sql.Timestamp getLastUpdateTime() {
    return lastUpdateTime;
  }

  public void setLastUpdateTime(java.sql.Timestamp lastUpdateTime) {
    this.lastUpdateTime = lastUpdateTime;
  }

}
