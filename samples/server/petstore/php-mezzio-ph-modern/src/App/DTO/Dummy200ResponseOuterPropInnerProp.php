<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\PhpAttribute as DTA;

class Dummy200ResponseOuterPropInnerProp
{
    #[DTA\Data(field: "myBool", nullable: true)]
    #[DTA\Validator("Scalar", ["type" => "bool"])]
    public bool|null $my_bool = null;

}
