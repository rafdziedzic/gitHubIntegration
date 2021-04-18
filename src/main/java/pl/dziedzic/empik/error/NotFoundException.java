package pl.dziedzic.empik.error;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND, reason = "Not Found this user")
public class NotFoundException extends Throwable {

}
