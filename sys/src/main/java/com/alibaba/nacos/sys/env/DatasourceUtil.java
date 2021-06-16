package com.alibaba.nacos.sys.env;

import com.alibaba.nacos.common.utils.StringUtils;

/**
 * 数据源工具类
 *
 * @author wangtan
 * @date 2021-06-11 15:11:57
 * @since 1.0.0
 */
public class DatasourceUtil {

    public static final String SPRING_DATASOURCE_PLATFORM = "spring.datasource.platform";

    public static final String MYSQL = "mysql";

    public static final String POSTGRESQL = "postgresql";

    public static String datasourcePlatform = "";

    /**
     * Don't let anyone else instantiate this class
     */
    private DatasourceUtil() {
    }

    /**
     * 获取当前数据源类型
     *
     * @return String
     * @author wangtan
     * @date 2021-06-11 15:17:39
     * @since 1.0.0
     */
    public static String getDatasourcePlatform() {
        if (StringUtils.isBlank(datasourcePlatform)) {
            datasourcePlatform = EnvUtil.getProperty(SPRING_DATASOURCE_PLATFORM, "");
        }
        return datasourcePlatform;
    }

}
