package com.example.cinema_api.validation.model;
import com.example.cinema_api.domain.OutputModel;

public class Error extends Result {
    private OutputModel outputModel;

    public Error(OutputModel outputModel) {
        this.outputModel = outputModel;
    }

    public OutputModel getOutputModel() {
        return outputModel;
    }
}
