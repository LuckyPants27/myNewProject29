package pro.sky.mynewproject29.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.CONFLICT)
public class EmployeeStorageIsFullException extends RuntimeException {
}
