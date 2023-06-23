<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\PhpAttribute as DTA;

/**
 * dummy
 */
class ExampleResponse
{
    #[DTA\Data(field: "emptyString", nullable: true)]
    #[DTA\Validator("Scalar", ["type" => "string"])]
    public string|null $empty_string = null;

    #[DTA\Data(field: "numberString", nullable: true)]
    #[DTA\Validator("Scalar", ["type" => "string"])]
    public string|null $number_string = null;

    #[DTA\Data(field: "boolString", nullable: true)]
    #[DTA\Validator("Scalar", ["type" => "string"])]
    public string|null $bool_string = null;

    #[DTA\Data(field: "nullString", nullable: true)]
    #[DTA\Validator("Scalar", ["type" => "string"])]
    public string|null $null_string = null;

    #[DTA\Data(field: "aBool", nullable: true)]
    #[DTA\Validator("Scalar", ["type" => "bool"])]
    public bool|null $a_bool = null;

    #[DTA\Data(field: "zero", nullable: true)]
    #[DTA\Validator("Scalar", ["type" => "int"])]
    public int|null $zero = null;

}
