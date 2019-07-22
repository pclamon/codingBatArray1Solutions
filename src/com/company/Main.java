package com.company;

public class Main
{

    public static void main(String[] args)
    {

    }

    public boolean firstLast6(int[] nums)
    {
        boolean firstLast6 = false;

        if (nums[0] == 6 || nums[nums.length - 1] == 6)
        {
            firstLast6 = true;
        }

        return firstLast6;
    }

    public boolean sameFirstLast(int[] nums)
    {
        boolean sameFirstLast = false;

        if (nums.length > 0 && nums[0] == nums[nums.length - 1])
        {
            sameFirstLast = true;
        }

        return sameFirstLast;
    }

    public int[] makePi()
    {
        int[] makePi = new int[3];
        makePi[0] = 3;
        makePi[1] = 1;
        makePi[2] = 4;

        return makePi;
    }

    public boolean commonEnd(int[] a, int[] b)
    {
        boolean commonEnd = false;

        if (a[0] == b[0] || a[a.length - 1] == b[b.length - 1])
        {
            commonEnd = true;
        }

        return commonEnd;
    }

    public int sum3(int[] nums)
    {
        int sum3 = 0;

        for (int i : nums)
        {
            sum3 += i;
        }

        return sum3;
    }

    public int[] rotateLeft3(int[] nums)
    {
        int[] rotateLeft3 = new int[3];
        rotateLeft3[0] = nums[1];
        rotateLeft3[1] = nums[2];
        rotateLeft3[2] = nums[0];

        return rotateLeft3;
    }

    public int[] reverse3(int[] nums)
    {
        int[] reverse3 = new int[3];
        reverse3[0] = nums[2];
        reverse3[1] = nums[1];
        reverse3[2] = nums[0];

        return reverse3;
    }

    public int[] maxEnd3(int[] nums)
    {
        int[] maxEnd3 = new int[3];

        if (nums[0] > nums[2])
        {
            maxEnd3[0] = nums[0];
            maxEnd3[1] = nums[0];
            maxEnd3[2] = nums[0];
        }
        else
        {
            maxEnd3[0] = nums[2];
            maxEnd3[1] = nums[2];
            maxEnd3[2] = nums[2];
        }

        return maxEnd3;
    }

    public int sum2(int[] nums)
    {
        int sum2 = 0;

        if (nums.length == 0)
        {
            sum2 = 0;
        }
        else if (nums.length < 2)
        {
            sum2 = nums[0];
        }
        else
        {
            sum2 = nums[0] + nums[1];
        }

        return sum2;
    }

    public int[] middleWay(int[] a, int[] b)
    {
        int[] middleWay = new int[2];
        middleWay[0] = a[1];
        middleWay[1] = b[1];

        return middleWay;
    }

    public int[] makeEnds(int[] nums)
    {
        int[] makeEnds = new int[2];
        makeEnds[0] = nums[0];
        makeEnds[1] = nums[nums.length - 1];

        return makeEnds;
    }

    public boolean has23(int[] nums)
    {
        boolean has23 = false;

        if (nums[0] == 2 || nums[1] == 2 || nums[0] == 3 || nums[1] == 3)
        {
            has23 = true;
        }

        return has23;
    }

    public boolean no23(int[] nums)
    {
        boolean no23 = false;

        if (nums[0] != 2 && nums[1] != 2 && nums[0] != 3 && nums[1] != 3)
        {
            no23 = true;
        }

        return no23;
    }

    public int[] makeLast(int[] nums)
    {
        int[] makeLast = new int[2 * nums.length];
        makeLast[makeLast.length - 1] = nums[nums.length - 1];

        return makeLast;
    }

    public boolean double23(int[] nums)
    {
        boolean double23 = false;

        if (nums.length > 1)
        {
            if (nums[0] == 2 && nums[1] == 2)
            {
                double23 = true;
            }
            else if (nums[0] == 3 && nums[1] == 3)
            {
                double23 = true;
            }
        }

        return double23;
    }

    public int[] fix23(int[] nums)
    {
        int[] fix23 = new int[3];
        fix23 = nums;

        if (nums[0] == 2 && nums[1] == 3)
        {
            fix23[1] = 0;
        }
        else if (nums[1] == 2 && nums[2] == 3)
        {
            fix23[2] = 0;
        }

        return fix23;
    }

    public int start1(int[] a, int[] b)
    {
        int start1 = 0;

        if (a.length > 0 && a[0] == 1)
        {
            start1++;
        }
        if (b.length > 0 && b[0] == 1)
        {
            start1++;
        }

        return start1;
    }

    public int[] biggerTwo(int[] a, int[] b)
    {
        int suma = a[0] + a[1];
        int sumb = b[0] + b[1];

        if (sumb > suma)
        {
            return b;
        }

        return a;
    }

    public int[] makeMiddle(int[] nums)
    {
        int[] makeMiddle = new int[2];
        makeMiddle[0] = nums[(nums.length / 2) - 1];
        makeMiddle[1] = nums[nums.length / 2];

        return makeMiddle;
    }

    public int[] plusTwo(int[] a, int[] b)
    {
        int[] plusTwo = new int[4];
        plusTwo[0] = a[0];
        plusTwo[1] = a[1];
        plusTwo[2] = b[0];
        plusTwo[3] = b[1];

        return plusTwo;
    }

    public int[] swapEnds(int[] nums)
    {
        int first = nums[0];
        int last = nums[nums.length - 1];
        nums[0] = last;
        nums[nums.length - 1] = first;

        return nums;
    }

    public int[] midThree(int[] nums)
    {
        int[] midThree = new int[3];
        midThree[0] = nums[(nums.length / 2) - 1];
        midThree[1] = nums[nums.length / 2];
        midThree[2] = nums[(nums.length / 2) + 1];

        return midThree;
    }

    public int maxTriple(int[] nums)
    {
        int maxTriple = 0;
        int first = nums[0];
        int middle = nums[(nums.length / 2)];
        int last = nums[nums.length - 1];

        if (first > middle && first > last)
        {
            maxTriple = first;
        }
        else if (middle > first && middle > last)
        {
            maxTriple = middle;
        }
        else
        {
            maxTriple = last;
        }

        return maxTriple;
    }

    public int[] frontPiece(int[] nums)
    {
        int[] frontPiece = new int[2];

        if (nums.length < 2)
        {
            frontPiece = nums;
        }
        else
        {
            frontPiece[0] = nums[0];
            frontPiece[1] = nums[1];
        }

        return frontPiece;
    }

    public boolean unlucky1(int[] nums)
    {
        if (nums.length < 2)
        {
            return false;
        }

        for (int i = 0; i <= 1; i++)
        {
            if (nums[i] == 1 && nums[i + 1] == 3)
            {
                return true;
            }
            if (nums.length < 3)
            {
                break;
            }
        }

        return nums[nums.length - 2] == 1 && nums[nums.length - 1] == 3;
    }

    public int[] make2(int[] a, int[] b)
    {
        int[] make2 = new int[2];

        if (a.length == 0)
        {
            make2[0] = b[0];
            make2[1] = b[1];
        }
        else if (a.length == 1)
        {
            make2[0] = a[0];
            make2[1] = b[0];
        }
        else
        {
            make2[0] = a[0];
            make2[1] = a[1];
        }

        return make2;
    }

    public int[] front11(int[] a, int[] b)
    {
        int[] front11 = new int[2];

        if (a.length == 0 && b.length == 0)
        {
            front11 = new int[0];
        }
        else if (a.length == 0)
        {
            front11 = new int[1];
            front11[0] = b[0];
        }
        else if (b.length == 0)
        {
            front11 = new int[1];
            front11[0] = a[0];
        }
        else
        {
            front11[0] = a[0];
            front11[1] = b[0];
        }

        return front11;
    }
}
