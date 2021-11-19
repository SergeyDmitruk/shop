import com.epam.brest.dto.DepartmentDTO;
import com.epam.brest.service.DepartmentDTOService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

@ExtendWith(SpringExtension.class)
@ContextConfiguration(locations = {"classpath*:test-db.xml", "classpath*:service-context-test.xml"})
@Transactional
public class DepartmentDtoServiceIT {

    @Autowired
    DepartmentDTOService departmentDtoService;

    @Test
    public void shouldFindAllDepartments() {
        List<DepartmentDTO> departments = departmentDtoService.findAllDepartments();
        assertNotNull(departments);
        assertTrue(departments.size() > 0);

    }

}
