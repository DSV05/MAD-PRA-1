class Matrix(val noOfRow: Int, val noOfCol: Int, val data: Array<IntArray>) {

    // Primary constructor for creating a matrix directly with data
    init {
        // Basic validation for matrix dimensions matching provided data
        if (data.size != noOfRow || (noOfRow > 0 && data[0].size != noOfCol)) {
            throw IllegalArgumentException("Matrix dimensions do not match provided data.")
        }
    }

    // Matrix Addition
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

    // Matrix Subtraction
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

    // Matrix Multiplication
    operator fun times(other: Matrix): Matrix {
        if (this.noOfCol != other.noOfRow) {
            throw IllegalArgumentException(
                "Invalid dimensions for multiplication: Matrix1 columns (${this.noOfCol}) must equal Matrix2 rows (${other.noOfRow})"
            )
        }

        val resultData = Array(this.noOfRow) { IntArray(other.noOfCol) }

        for (i in 0 until this.noOfRow) {
            for (j in 0 until other.noOfCol) {
                for (k in 0 until this.noOfCol) {
                    resultData[i][j] += this.data[i][k] * other.data[k][j]
                }
            }
        }

        return Matrix(this.noOfRow, other.noOfCol, resultData)
    }

    // Display matrix
    fun display() {
        for (row in data) {
            println(row.joinToString(" "))
        }
    }
}
