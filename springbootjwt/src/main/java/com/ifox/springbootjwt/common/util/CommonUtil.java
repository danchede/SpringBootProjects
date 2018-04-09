package com.ifox.springbootjwt.common.util;

/**
 * @Author:zhongchao
 * @Organization: ifox
 * @Description:
 * @Date:Created in18:30 2018/4/9
 * @Modified By:
 */
public class CommonUtil {

    public static boolean isNewer(String version, String nowVersion) {
        try {
            String[] versions = version.split("\\.");
            String[] nowVersions = nowVersion.split("\\.");

            if (versions.length != nowVersions.length) {
                return false;
            }
            int sum = 0;
            for (String v : versions) {
                sum += sum * 10 + Integer.valueOf(v);
            }

            int nowSum = 0;
            for (String nv : nowVersions) {
                nowSum += nowSum * 10 + Integer.valueOf(nv);
            }

            return sum > nowSum;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}
