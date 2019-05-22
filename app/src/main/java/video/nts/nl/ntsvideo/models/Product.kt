package video.nts.nl.ntsvideo.models

import java.io.Serializable

data class Product (
    var id:Int = 0,
    var p_name: String? = null,
    var p_timestamp: String? = null
): Serializable