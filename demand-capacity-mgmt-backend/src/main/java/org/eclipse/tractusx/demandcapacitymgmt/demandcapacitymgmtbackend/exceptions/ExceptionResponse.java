package org.eclipse.tractusx.demandcapacitymgmt.demandcapacitymgmtbackend.exceptions;

import lombok.Getter;
import lombok.Setter;

import java.util.List;


@Getter
@Setter
public class ExceptionResponse {
    private static final long serialVersionUID = 1L;
    private String code;
    private String message;
    private List<String> details;

}
