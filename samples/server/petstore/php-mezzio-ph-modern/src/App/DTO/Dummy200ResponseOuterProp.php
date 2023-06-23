<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\PhpAttribute as DTA;

class Dummy200ResponseOuterProp
{
    #[DTA\Data(field: "innerProp", nullable: true)]
    #[DTA\Strategy("Object", ["type" => \App\DTO\Dummy200ResponseOuterPropInnerProp::class])]
    #[DTA\Validator("TypeCompliant", ["type" => \App\DTO\Dummy200ResponseOuterPropInnerProp::class])]
    public \App\DTO\Dummy200ResponseOuterPropInnerProp|null $inner_prop = null;

}
