
package com.idea.it.core.permission.data;

import com.idea.it.core.permission.domain.Resource;

/**  
* 类说明   
*  
* @author ****  
* @date 2017年8月10日  新建  
*/

public interface IResourceData
{

    /**
     * 根据资源编码查找资源
     * 
     * @param resoucreCode
     * @param resourceType
     * @param operationCode
     * @param appName
     * @return
     */

    Resource queryResoure( String resoucreCode, String resourceType,
            String operationCode, String appName );

    /**
     * 更新资源
     * 
     * @param resource
     */
    void updateResource( Resource resource );

    /**
     * 插入资源
     * 
     * @param resource
     */
    void insert( Resource resource );

    /**
     * 删除系统某种资源
     * 
     * @param resourceType
     * @param appName
     */
    void deleteApplicationResourceByServiceType( String resourceType,
            String appName );

    /**
     * 失效系统某种资源
     * 
     * @param resourceType
     * @param appName
     */
    void disableApplicationResourceByServiceType( String resourceType,
            String appName );

    /**
     * 删除失效的资源
     * 
     * @param resourceType
     * @param appName
     */
    void deleteDisableApplicationResourceByServiceType( String resourceType,
            String appName );
}
