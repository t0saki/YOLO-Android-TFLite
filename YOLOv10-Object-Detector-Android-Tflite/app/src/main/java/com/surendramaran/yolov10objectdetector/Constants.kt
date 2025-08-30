package com.surendramaran.yolov10objectdetector

object Constants {
    const val MODEL_PATH = "yolo11n_int8.tflite"
    const val OLD_MODEL_PATH_FOR_METADATA = "yolov10n_int8.tflite"
    val LABELS_PATH: String? = null // provide your labels.txt file if the metadata not present in the model
}
