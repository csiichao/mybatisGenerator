package test.dao;

import com.yunlovec.SysRolePrivilege;
import com.yunlovec.SysRolePrivilegeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SysRolePrivilegeMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_role_privilege
     *
     * @mbggenerated
     */
    int countByExample(SysRolePrivilegeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_role_privilege
     *
     * @mbggenerated
     */
    int deleteByExample(SysRolePrivilegeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_role_privilege
     *
     * @mbggenerated
     */
    int insert(SysRolePrivilege record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_role_privilege
     *
     * @mbggenerated
     */
    int insertSelective(SysRolePrivilege record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_role_privilege
     *
     * @mbggenerated
     */
    List<SysRolePrivilege> selectByExample(SysRolePrivilegeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_role_privilege
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") SysRolePrivilege record, @Param("example") SysRolePrivilegeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_role_privilege
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") SysRolePrivilege record, @Param("example") SysRolePrivilegeExample example);
}