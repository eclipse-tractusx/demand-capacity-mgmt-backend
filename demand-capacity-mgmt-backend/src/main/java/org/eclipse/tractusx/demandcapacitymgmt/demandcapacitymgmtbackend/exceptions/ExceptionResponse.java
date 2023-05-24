package org.eclipse.tractusx.demandcapacitymgmt.demandcapacitymgmtbackend.exceptions;

import java.util.List;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ExceptionResponse {

    private static final long serialVersionUID = 1L;
    private String code;
    private String message;
    private List<String> details;
}
