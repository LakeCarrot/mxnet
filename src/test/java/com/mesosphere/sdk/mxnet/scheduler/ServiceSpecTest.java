package com.mesosphere.sdk.mxnet.scheduler;

import com.mesosphere.sdk.testing.BaseServiceSpecTest;
import org.junit.Test;

public class ServiceSpecTest extends BaseServiceSpecTest {

    public ServiceSpecTest() {
        super(
                "EXECUTOR_URI", "",
                "LIBMESOS_URI", "",
                "PORT_API", "8080",
                "FRAMEWORK_NAME", "mxnet",

                "NODE_COUNT", "2",
                "NODE_CPUS", "0.1",
                "NODE_MEM", "512",
                "NODE_DISK", "5000",
                "NODE_DISK_TYPE", "ROOT",


                "ROOT_COUNT", "2",
                "ROOT_CPUS", "0.1",
                "ROOT_MEM", "512",
                "ROOT_DISK", "5000",
                "ROOT_DISK_TYPE", "ROOT",

                "SERVER_COUNT", "2",
                "SERVER_CPUS", "0.1",
                "SERVER_MEM", "512",
                "SERVER_DISK", "5000",
                "SERVER_DISK_TYPE", "ROOT",

                "WORKER_COUNT", "2",
                "WORKER_CPUS", "0.1",
                "WORKER_MEM", "512",
                "WORKER_DISK", "5000",
                "WORKER_DISK_TYPE", "ROOT",
                "SLEEP_DURATION", "1000");
        envVars.put("MXNET_DOCKER_IMAGE", "mxnet/python");
    }

    @Test
    public void testYmlBase() throws Exception {
        testYaml("svc.yml");
    }
}
