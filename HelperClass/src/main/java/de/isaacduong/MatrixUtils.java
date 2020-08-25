package de.isaacduong;

public class MatrixUtils
{

	/**
	 * @param matrixA 2-dimensional array
	 * @param matrixB 2-dimensional array
	 * @return sum of matrixA and matrixB
	 * @throws Exception if matrixA and matrixB are of different shape
	 */

	public static int[][] matrixAdd(int[][] matrixA, int[][] matrixB) throws Exception
	{

		int[][] sum = new int[matrixA.length][matrixA[0].length];
		if ((matrixA.length == matrixB.length) && (matrixA[0].length == matrixB[0].length))

		{
			for (int i = 0; i < matrixA.length; i++)
			{
				for (int j = 0; j < matrixA[0].length; j++)
				{
					sum[i][j] = matrixA[i][j] + matrixB[i][j];
				}
			}

		}
		else
		{
			throw new Exception("matrixes need to be of same shape");
		}

		return sum;

	}

	/**
	 * @param matrixA 2-dimensional array
	 * @param matrixB 2-dimensional array
	 * @return difference of matrixA and matrixB
	 * @throws Exception if matrixA and matrixB are of different shape
	 */

	public static int[][] matrixSub(int[][] matrixA, int[][] matrixB) throws Exception
	{

		int[][] dif = new int[matrixA.length][matrixA[0].length];
		if ((matrixA.length == matrixB.length) && (matrixA[0].length == matrixB[0].length))

		{
			for (int i = 0; i < matrixA.length; i++)
			{
				for (int j = 0; j < matrixA[0].length; j++)
				{
					dif[i][j] = matrixA[i][j] - matrixB[i][j];
				}
			}

		}
		else
		{
			throw new Exception("matrixes need to be of same shape");
		}

		return dif;

	}

	/**
	 * 
	 * @param matrix to transpose
	 * @return transposed Matrix
	 * @throws Exception will be thrown if matrix is not of squared shape
	 */
	public static int[][] matrixTranspose(int[][] matrix) throws Exception
	{

		if (matrix.length == matrix[0].length)
		{
			int[][] matrixT = new int[matrix.length][matrix.length];
			for (int i = 0; i < matrixT.length; i++)
			{
				for (int j = 0; j < matrixT.length; j++)
				{
					matrixT[i][j] = matrix[j][i];
				}

			}

			return matrixT;

		}
		else
		{
			throw new Exception("it has to be a squared matrix ");

		}

	}

	/**
	 * 
	 * @param matrixA to multiply
	 * @param matrixB to multiply
	 * @return product of two matrixes
	 * @throws Exception if matrixes are not of required shapes
	 */
	public static int[][] matrixMul(int[][] matrixA, int[][] matrixB) throws Exception
	{

		if (matrixA[0].length == matrixB.length)
		{
			int[][] matrix = new int[matrixA.length][matrixB[0].length];
			for (int i = 0; i < matrixA.length; i++)
			{
				for (int j = 0; j < matrixA[0].length; j++)
				{
					for (int k = 0; k < matrixB[0].length; k++)
					{
						matrix[i][k] += matrixA[i][j] * matrixB[j][i];
					}

				}
			}
			return matrix;

		}
		else
		{
			throw new Exception();
		}

	}

}
