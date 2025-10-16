package com.patika.dto.response;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class ImageSavedResponse extends PatikaResponse{
    private String imageId;

    public ImageSavedResponse(String message, Boolean success, String imageId) {
        super(message, success);
        this.imageId = imageId;
    }
}
