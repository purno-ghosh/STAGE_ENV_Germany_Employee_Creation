package STAGE_Employee_Create;

import Setup_All.Setup;
import org.testng.annotations.Test;

import java.io.IOException;

public class STAGE_ENV_Germany_Employee_Create_Runner extends Setup {
    @Test
    public void testEmployeeCreation() throws IOException, InterruptedException {
        STAGE_ENV_Germany_Employee_Create employeeCreate = new STAGE_ENV_Germany_Employee_Create(driver);
        employeeCreate.create_employee();

    }

}
