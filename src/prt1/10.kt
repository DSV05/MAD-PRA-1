class Matrix(val noOfRow: Int, val noOfCol: Int, val data: Array<IntArray>) {

    // Primary constructor for creating a matrix directly with data
    init {
        // Basic validation for matrix dimensions matching provided data
        if (data.size != noOfRow || (noOfRow > 0 && data[0].size != noOfCol)) {
            throw IllegalArgumentException("Matrix dimensions do not match provided data.")
        }
    }

    operator fun plus(other: Matrix): Matrix {
        if (noOfRow != other.noOfRow || noOfCol != other.noOfCol) {
            throw IllegalArgumentException("Matrices must have the same dimensions for addition.")
        }

        val resultData = Array(noOfRow) { IntArray(noOfCol) }
        for (i in 0 until noOfRow) {
            for (j in 0 until noOfCol) {
                resultData[i][j] = this.data[i][j] + other.data[i][j]
            }
        }
        return Matrix(noOfRow, noOfCol, resultData)
    }

    operator fun minus(other: Matrix): Matrix {
        if (noOfRow != other.noOfRow || noOfCol != other.noOfCol) {
            throw IllegalArgumentException("Matrices must have the same dimensions for subtraction.")
        }

        val resultData = Array(noOfRow) { IntArray(noOfCol) }
        for (i in 0 until noOfRow) {
            for (j in 0 until noOfCol) {
                resultData[i][j] = this.data[i][j] - other.data[i][j]
            }
        }
        return Matrix(noOfRow, noOfCol, resultData)
    }

    operator fun times(other: Matrix): Matrix {
        // For multiplication: number of columns in the first matrix must equal
        // number of rows in the second matrix.
        if (this.noOfCol != other.noOfRow) {
            throw IllegalArgumentException(
                "Invalid dimensions for multiplication: " +
                        "Matrix1 columns (${this.noOfCol}) must equal Matrix2 rows (${other.noOfRow})"
            )
        }
