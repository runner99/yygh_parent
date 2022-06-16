package com.oss.test;

import com.aliyun.oss.OSS;
import com.aliyun.oss.OSSClientBuilder;
import com.aliyun.oss.OSSException;

public class OssTest {

    public static void main(String[] args) {
        // Endpoint以华东1（杭州）为例，其它Region请按实际情况填写。
        String endpoint = "https://oss-cn-hangzhou.aliyuncs.com";
        // 阿里云账号AccessKey拥有所有API的访问权限，风险很高。强烈建议您创建并使用RAM用户进行API访问或日常运维，请登录RAM控制台创建RAM用户。
        String accessKeyId = "LTAI5t8w4QAEmbcyp3J9a7Ps";
        String accessKeySecret = "92AJHU4TwMZ3i0QIm2mK6CLII6kiZ7";
        // 填写Bucket名称，例如examplebucket。
        String bucketName = "yygh-1testosssssss";

        // 创建OSSClient实例。
        OSS ossClient = new OSSClientBuilder().build(endpoint, accessKeyId, accessKeySecret);


        // 创建存储空间。
        ossClient.createBucket(bucketName);

        // 关闭OSSClient
        ossClient.shutdown();

    }
}
